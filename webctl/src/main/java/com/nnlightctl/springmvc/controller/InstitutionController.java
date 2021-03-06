package com.nnlightctl.springmvc.controller;

import com.nnlight.common.Tuple;
import com.nnlightctl.po.Institution;
import com.nnlightctl.po.Project;
import com.nnlightctl.request.BaseRequest;
import com.nnlightctl.request.InstitutionConditionRequest;
import com.nnlightctl.request.InstitutionRequest;
import com.nnlightctl.result.JsonResult;
import com.nnlightctl.server.InstitutionServer;
import com.nnlightctl.vo.InstitutionView;
import com.nnlightctl.vo.ProjectsToInstitutionView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nnlightctl.request.MapProjectsToInstitutionRequest;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/institution")
public class InstitutionController extends BaseController {
    private Logger logger = LoggerFactory.getLogger(InstitutionController.class);

    @Autowired
    private InstitutionServer institutionServer;

    @RequestMapping("addOrUpdateInstitution")
    public String addOrUpdateInstitution(@Valid InstitutionRequest request, BindingResult bindingResult) {
        logger.info("[POST] /api/institution/addOrUpdateInstitution");

        //参数检验
        if (bindingResult.hasErrors()) {
            JsonResult jsonResult = JsonResult.getFAILURE();
            StringBuilder stringBuilder = new StringBuilder();
            List<ObjectError> objectErrorList = bindingResult.getAllErrors();
            for (ObjectError objectError : objectErrorList) {
                stringBuilder.append(objectError.getDefaultMessage() + "\r\n");
            }

            jsonResult.setMsg(stringBuilder.toString());
            return toJson(jsonResult);
        }

        int ret = institutionServer.addOrUpdateInstitution(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }
    /*
    *机构管理
    *一点一、通过机构名称统计机构数量（用于判断机构名称是否重复）
    * */
    @RequestMapping("countInstitutionByName")
    public String countInstitutionByName(String institutionName){
        logger.info("[POST] /api/institution/countInstitutionByName");
        int total = institutionServer.getCountInstitutionByName(institutionName);
        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setTotal(total);
        return toJson(jsonResult);
    }

    @RequestMapping("listInsitution")
    public String listInstitution(InstitutionRequest request) {
        logger.info("[POST] /api/institution/listInsitution");

        Tuple.TwoTuple<List<InstitutionView>, Integer> tuple = institutionServer.listInstitution(request);

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(tuple.getFirst());
        jsonResult.setTotal(tuple.getSecond());

        return toJson(jsonResult);
    }

    @RequestMapping("getInstitution")
    public String getInstitution(Long id) {
        logger.info("[POST] /api/institution/getInstitution");

        Institution institution = institutionServer.getInstitutionById(id);

        JsonResult jsonResult = JsonResult.getSUCCESS();

        List<Institution> institutionList = new ArrayList<>(1);
        institutionList.add(institution);

        jsonResult.setData(institutionList);

        return toJson(jsonResult);
    }

    @RequestMapping("deleteInstitution")
    public String deleteInstitution(InstitutionConditionRequest request) {
        logger.info("[POST] /api/institution/deleteInstitution");

        int ret = institutionServer.deleteInstitution(request.getInstitutionIds());

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    /*
    *五、映射机构包含项目
    * */
    @RequestMapping("institutionMapProjects")
    public String mapProjectsToInstitution(MapProjectsToInstitutionRequest mapProjectsToInstitutionRequest){
        logger.info("[POST] /api/institution/institutionMapProjects");

        List<ProjectsToInstitutionView> projectsToInstitutionViewList = institutionServer.mapProjectsToInstitution(mapProjectsToInstitutionRequest);
        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(projectsToInstitutionViewList);

        return toJson(jsonResult);
    }

    /**
     * 通过机构id获取机构下全部项目
     * @param request
     * @return
     */
    @RequestMapping("getProjectsByInstitutionId")
    public String getProjectsByInstitutionId(InstitutionConditionRequest request) {
        logger.info("[POST] /api/institution/getProjectsByInstitutionId");

        List<Project> projectList = institutionServer.listProjectByInsitutionId(request.getInstitutionId());
        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(projectList);

        return toJson(jsonResult);
    }

    /**
     * 映射机构包含项目2
     * @param request
     * @return
     */
    @RequestMapping("institutionMapProjects2")
    public String mapProjects2Institution(InstitutionConditionRequest request) {
        logger.info("[POST] /api/institution/institutionMapProjects2");

        int ret = institutionServer.updateMapProjects2Institution(request);
        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    /**
     * 获取不属于任何机构的项目集合
     * @return
     */
    @RequestMapping("listNotBeProjects")
    public String listNotBeProjects() {
        logger.info("[POST] /api/institution/listNotBeProjects");

        List<Project> projectList = institutionServer.listNotBeProjects();
        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(projectList);

        return toJson(jsonResult);
    }

}
