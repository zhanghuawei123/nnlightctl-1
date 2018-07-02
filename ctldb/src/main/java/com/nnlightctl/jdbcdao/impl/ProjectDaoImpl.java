package com.nnlightctl.jdbcdao.impl;

import com.nnlightctl.jdbcdao.ProjectDao;
import com.nnlightctl.request.BaseRequest;
import com.nnlightctl.request.MapProjectsToInstitutionRequest;
import com.nnlightctl.vo.ProjectView;
import com.nnlightctl.vo.ProjectsToInstitutionView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProjectDaoImpl implements ProjectDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<ProjectView> listProject(BaseRequest request) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Object> param = new ArrayList<>(2);

        stringBuilder.append("select p.id, p.gmt_created, p.gmt_updated, p.code_number, p.project_name, p.ctype, c.country_name, pp.province_name, cc.city_name, p.longitude, p.latitude, p.mem, p.state ");
        stringBuilder.append("from nnlightctl_project p ");
        stringBuilder.append("left join nnlightctl_project_country c on p.nnlightctl_project_country_id = c.id ");
        stringBuilder.append("left join nnlightctl_project_province pp on p.nnlightctl_project_province_id  = pp.id ");
        stringBuilder.append("left join nnlightctl_project_city cc on p.nnlightctl_project_city_id = cc.id ");
        stringBuilder.append("order by id DESC ");
        if (request.getPageSize() > 0 && request.getPageNumber() > 0) {
            stringBuilder.append("limit ?, ?");
            param.add((request.getPageNumber() - 1) * request.getPageSize());
            param.add(request.getPageSize());
        }
        List<ProjectView> projectViewList = jdbcTemplate.query(stringBuilder.toString(), param.toArray(), new RowMapper<ProjectView>() {
            @Override
            public ProjectView mapRow(ResultSet resultSet, int i) throws SQLException {
                ProjectView projectView = new ProjectView();
                projectView.setId(resultSet.getLong("id"));
                projectView.setGmtCreated(resultSet.getDate("gmt_created"));
                projectView.setGmtUpdated(resultSet.getDate("gmt_updated"));
                projectView.setCodeNumber(resultSet.getString("code_number"));
                projectView.setProjectName(resultSet.getString("project_name"));
                projectView.setType(resultSet.getInt("ctype"));
                projectView.setContryName(resultSet.getString("country_name"));
                projectView.setProvinceName(resultSet.getString("province_name"));
                projectView.setCityName(resultSet.getString("city_name"));
                projectView.setLongitude(resultSet.getString("longitude"));
                projectView.setLatitude(resultSet.getString("latitude"));
                projectView.setMem(resultSet.getString("mem"));
                projectView.setState(resultSet.getInt("state"));
                return projectView;
            }
        });
        return projectViewList;
    }

    public List<ProjectsToInstitutionView> mapProjectsToInstitution(MapProjectsToInstitutionRequest mapProjectsToInstitutionRequest){
        StringBuilder stringBuilder = new StringBuilder();
        List<Object> param = new ArrayList<>(1);
        String projectIds = "";
        stringBuilder.append("select a.id ,a.gmt_created ,a.gmt_updated ,a.create_time ,a.institution_level ,a.institution_name ,a.mem ,a.nnlightctl_institution_id_parent , ");
        stringBuilder.append("b.code_number ,b.ctype ,b.latitude ,b.longitude ,b.id as prjectId ,b.nnlightctl_project_city_id ,b.nnlightctl_project_country_id ,b.nnlightctl_project_province_id ,b.code_number ");
        stringBuilder.append(",b.state FROM   nnlightctl_institution a LEFT JOIN nnlightctl_project b on a.id = b.nnlightctl_institution_id WHERE 1=1 ");
        if (mapProjectsToInstitutionRequest.getInstitutionId() != null) {
            stringBuilder.append("and a.id = ? ");
            param.add(mapProjectsToInstitutionRequest.getInstitutionId());
        }

        if(mapProjectsToInstitutionRequest.getProjectIds().isEmpty()){
            stringBuilder.append(" and 1=1 ");
        }else{
            for(int i = 0; i < mapProjectsToInstitutionRequest.getProjectIds().size();i++){
                if(i!=( mapProjectsToInstitutionRequest.getProjectIds().size()-1)){
                    projectIds +=  mapProjectsToInstitutionRequest.getProjectIds().get(i) + ",";
                }else{
                    projectIds +=  mapProjectsToInstitutionRequest.getProjectIds().get(i);
                }
            }
            stringBuilder.append(" and b.id IN("+projectIds+") ");
        }

        List<ProjectsToInstitutionView> projectsToInstitutionViewList = jdbcTemplate.query(stringBuilder.toString(), param.toArray(), new RowMapper<ProjectsToInstitutionView>() {
            @Override
            public ProjectsToInstitutionView mapRow(ResultSet resultSet, int i) throws SQLException {
                ProjectsToInstitutionView projectsToInstitutionView = new ProjectsToInstitutionView();
                projectsToInstitutionView.setId(resultSet.getLong("id"));
                projectsToInstitutionView.setGmtCreated(resultSet.getDate("gmt_created"));
                projectsToInstitutionView.setGmtUpdated(resultSet.getDate("gmt_updated"));
                projectsToInstitutionView.setCreateTime(resultSet.getDate("create_time"));
                projectsToInstitutionView.setInstitutionLevel(resultSet.getByte("institution_level"));
                projectsToInstitutionView.setInstitutionName(resultSet.getString("institution_name"));
                projectsToInstitutionView.setMem(resultSet.getString("mem"));
                projectsToInstitutionView.setNnlightctlInstitutionIdParent(resultSet.getLong("nnlightctl_institution_id_parent"));

                projectsToInstitutionView.setCodeNumber(resultSet.getString("code_number"));
                projectsToInstitutionView.setCtype(resultSet.getByte("ctype"));
                projectsToInstitutionView.setLatitude(resultSet.getString("latitude"));
                projectsToInstitutionView.setLongitude(resultSet.getString("longitude"));
                projectsToInstitutionView.setNnlightctlProjectCityId(resultSet.getLong("nnlightctl_project_city_id"));
                projectsToInstitutionView.setNnlightctlProjectCountryId(resultSet.getLong("nnlightctl_project_country_id"));
                return projectsToInstitutionView;
            }
        });

        return projectsToInstitutionViewList;
    }
}
