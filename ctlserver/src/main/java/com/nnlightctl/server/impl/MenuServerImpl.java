package com.nnlightctl.server.impl;

import com.nnlightctl.dao.RighterMapper;
import com.nnlightctl.jdbcdao.MenuDao;
import com.nnlightctl.po.Righter;
import com.nnlightctl.po.RighterExample;
import com.nnlightctl.po.User;
import com.nnlightctl.request.SaveUserMapRightersRequest;
import com.nnlightctl.server.MenuServer;
import com.nnlightctl.vo.GetUserWithRighterView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MenuServerImpl implements MenuServer {

    @Autowired
    private RighterMapper righterMapper;
    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Righter> listMenuLevel1(){
        RighterExample righterExample = new RighterExample();
        Byte level = 1;
        righterExample.createCriteria().andRighterLevelEqualTo(level);
        righterExample.setOrderByClause("id DESC");
        return  righterMapper.selectByExample(righterExample);
    }
    @Override
    public List<Righter> listMenuLevelSub(Integer parentId){
        RighterExample righterExample = new RighterExample();
        righterExample.createCriteria().andParentRighterIdEqualTo(parentId.longValue());
        List<Righter> righterList = righterMapper.selectByExample(righterExample);
        if (!righterList.isEmpty()){
            for (int i = 0 ; i<righterList.size() ; i++){
            List<Righter> righterList2= new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            list.add(righterList.get(i).getId().intValue());
            righterList2=listMenuLevelSub(list.get(i));
                if(righterList2.isEmpty()){
                    break;
                }else {
                    righterList.addAll(righterList2);
                }

            }
        }
        /*for (int i = 0 ; i<righterList.size() ; i++){
            List<Righter> righterList2= new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            list.add(righterList.get(i).getId().intValue());
            righterList2=listMenuLevelSub(list.get(i));
            if(righterList2.isEmpty()){
                break;
            }else {
                righterList.addAll(righterList2);
            }

        }*/

        return righterList;
    }

    @Override
    public int insertSaveUserMapRighters(SaveUserMapRightersRequest request){
        return menuDao.insertSaveUserMapRighters(request);
    }
    @Override
    public List<GetUserWithRighterView> getUserWithRighter(Integer userId){
        return menuDao.getUserWithRighter(userId);
    }
}
