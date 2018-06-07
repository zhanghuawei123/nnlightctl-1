package com.nnlightctl.springmvc.controller;

import com.nnlight.common.Tuple;
import com.nnlightctl.po.SwitchTask;
import com.nnlightctl.request.BaseRequest;
import com.nnlightctl.request.SwitchTaskConditionRequest;
import com.nnlightctl.request.SwitchTaskRequest;
import com.nnlightctl.result.JsonResult;
import com.nnlightctl.server.SwitchTaskServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/switchTask")
public class SwitchTaskController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(SwitchTaskController.class);

    @Autowired
    private SwitchTaskServer switchTaskServer;

    @RequestMapping("addOrUpdateSwitchTask")
    public String addOrUpdateSwitchTask(SwitchTaskRequest request) {
        logger.info("[POST] /api/switchTask/addOrUpdateSwitchTask");

        int ret = this.switchTaskServer.addOrUpdateSwitchTask(request);
        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("listSwitchTask")
    public String listSwitchTask(SwitchTaskConditionRequest request) {
        logger.info("[POST] /api/switchTask/listSwitchTask");

        Tuple.TwoTuple<List<SwitchTask>, Integer> tuple = this.switchTaskServer.listSwitchTask(request);

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(tuple.getFirst());
        jsonResult.setTotal(jsonResult.getTotal());

        return toJson(jsonResult);
    }

    @RequestMapping("getSimpleSwitchTask")
    public String getSwitchTask(Long id) {
        logger.info("[POST] /api/switchTask/getSimpleSwitchTask");

        SwitchTask switchTask = this.switchTaskServer.getSwitchTask(id);

        JsonResult jsonResult = JsonResult.getSUCCESS();

        List<SwitchTask> switchTaskList = new ArrayList<>(1);
        switchTaskList.add(switchTask);

        jsonResult.setData(switchTaskList);

        return toJson(jsonResult);
    }

    @RequestMapping("deleteSwitchTask")
    public String deleteSwitchTask(SwitchTaskConditionRequest request) {
        logger.info("[POST] /api/switchTask/deleteSwitchTask");

        int ret = this.switchTaskServer.deleteSwitchTask(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }
}
