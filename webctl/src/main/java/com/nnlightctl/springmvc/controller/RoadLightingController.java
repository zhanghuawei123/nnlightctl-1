package com.nnlightctl.springmvc.controller;

import com.nnlight.common.DownloadFileNameUtil;
import com.nnlight.common.Tuple;
import com.nnlightctl.po.*;
import com.nnlightctl.request.*;
import com.nnlightctl.result.JsonResult;
import com.nnlightctl.server.*;
import com.nnlightctl.util.DownloadUtil;
import com.nnlightctl.vo.EleboxView;
import com.nnlightctl.vo.GISView;
import com.nnlightctl.vo.LightingView;
import com.nnlightctl.vo.RegionView;
import org.apache.avro.generic.GenericData;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/roadlighting")
public class RoadLightingController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(RoadLightingController.class);

    @Autowired
    private ModelLoopServer modelLoopServer;

    @Autowired
    private EleboxModelServer modelServer;

    @Autowired
    private EleboxServer eleboxServer;

    @Autowired
    private LightServer lightServer;

    @Autowired
    private LightModelServer lightModelServer;

    @Autowired
    private GISServer gisServer;

    @Autowired
    private AreaServer areaServer;

    @RequestMapping("addorupdatemodelloop")
    public String addOrUpdateModelLoop(ModelLoopRequest request) {
        logger.info("[POST] /api/roadlighting/addorupdatemodelloop");

        int ret = modelLoopServer.addOrUpdateModelLoop(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("deletemodelloop")
    public String deleteModeLoop(ModelLoopConditionRequest request) {
        logger.info("[POST] /api/roadlighting/deletemodelloop");

        int ret = modelLoopServer.deleteModelLoop(request);
        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("addeleboxmodel")
    public String addEleboxModel(EleboxModelRequest request) {
        logger.info("[POST] /api/roadlighting/addeleboxmodel");

        int ret = modelServer.addEleboxModel(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("updateeleboxmodel")
    public String updateEleboxModel(EleboxModelRequest request) {
        logger.info("[POST] /api/roadlighting/updateeleboxmodel");

        int ret = modelServer.updateEleboxModel(request);
        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("deleteeleboxmodel")
    public String deleteEleboxModel(EleboxModelConditionRequest request) {
        logger.info("[POST] /api/roadlighting/deleteeleboxmodel");

        int ret = modelServer.deleteEleboxModel(request);
        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("addelebox")
    public String addEleBox(@Valid EleboxAddModelRequest request, BindingResult bindingResult) {
        logger.info("[POST] /api/roadlighting/addelebox");

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

        int ret = eleboxServer.insertElebox(request);
        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }
    /*
     *前端接口-道路照明系统模块
     *一点一、通过UID统计模块的数量（判断模块UID是否重复）
     * */
    @RequestMapping("countModelByUid")
    public String countModelByUid(String uid){
        logger.info("[POST] /api/roadlighting/countModelByUid");
        int total = eleboxServer.getCountModelByUid(uid);
        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setTotal(total);
        return toJson(jsonResult);
    }
    /*
     *前端接口-道路照明系统模块
     *一点二、通过模块ID和回路编码统计该回路在该模块中的数量（判断回路编码在所在模块中是否重复）
     * */
    @RequestMapping("countModelLoopByLoopCode")
    public String countModelLoopByLoopCode(ModelLoopByLoopCodeRequest request){
        logger.info("[POST] /api/roadlighting/countModelLoopByLoopCode");
        int total = eleboxServer.getCountModelLoopByLoopCode(request);
        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setTotal(total);
        return toJson(jsonResult);
    }

    @RequestMapping("updateelebox")
    public String updateEleBox(@Valid EleboxRequest request, BindingResult bindingResult) {
        logger.info("[POST] /api/roadlighting/updateelebox");

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

        int ret = eleboxServer.updateElebox(request);
        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }
    /*
    *前端接口-道路照明系统模块
     *二点零一、通过控制柜UID统计控制柜数量（判断控制柜UID是否重复）
    * */
    @RequestMapping("countEleboxByUid")
    public String countEleboxByUid(String uid){
        logger.info("[POST] /api/roadlighting/countEleboxByUid");
        int total = eleboxServer.getCountEleboxByUid(uid);
        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setTotal(total);
        return toJson(jsonResult);
    }
    /*
     *前端接口-道路照明系统模块
     *二点零二、通过控制柜编码统计控制柜数量（判断控制柜编码是否重复）
     * */
    @RequestMapping("countEleboxByCodeNumber")
    public String countEleboxByCodeNumber(String codeNumber) {
        logger.info("[POST] /api/roadlighting/countEleboxByCodeNumber");
        int total = eleboxServer.getCountEleboxByCodeNumber(codeNumber);
        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setTotal(total);
        return toJson(jsonResult);
    }
    @RequestMapping("getElebox")
    public String getElebox(Long id) {
        logger.info("[POST] /api/roadlighting/getElebox");

        Elebox elebox = eleboxServer.getEleboxById(id);

        List<Elebox> data = new ArrayList<>(1);
        data.add(elebox);

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(data);

        return toJson(jsonResult);
    }

    @RequestMapping("getLoopLight")
    public String getLoopLight(Long id) {
        logger.info("[POST] /api/roadlighting/getLoopLight");

        List<LightingView> lightingList = lightServer.getLightByLoopId(id);

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(lightingList);

        return toJson(jsonResult);
    }

    @RequestMapping("updateLightBeEleboxBeLoop")
    public String updateLightBeEleboxBeLoop(LightConditionRequest request) {
        logger.info("[POST] /api/roadlighting/updateLightBeEleboxBeLoop");

        int ret = lightServer.updateLightBeEleboxBeLoop(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("updateLightBeEleboxBeLoop2")
    public String updateLightBeEleboxBeLoop2(LightConditionRequest request) {
        logger.info("[POST] /api/roadlighting/updateLightBeEleboxBeLoop2");

        int ret = lightServer.updateLightBeEleboxBeLoop2(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("updateEleboxDevice")
    public String updateEleboxDevice(EleboxConditionRequest request) {
        logger.info("[POST] /api/roadlighting/updateEleboxDevice");

        int ret = eleboxServer.updateEleboxDevice(request);
        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("splitmodelloop")
    public String modelLoopSplite(@Valid EleboxConditionRequest request, BindingResult bindingResult) {
        logger.info("[POST] /api/roadlighting/splitmodelloop");

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

        int ret = eleboxServer.updateModelLoopSplite(request);
        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("deleteelebox")
    public String deleteElebox(EleboxConditionRequest request) {
        logger.info("[POST] /api/roadlighting/deleteelebox");

        int ret = eleboxServer.deleteElebox(request);
        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("listelebox")
    public String listElebox(EleboxConditionRequest request) {
        logger.info("[POST] /api/roadlighting/listelebox");

        Tuple.TwoTuple<List<EleboxView>, Integer> tuple = eleboxServer.listElebox(request);

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(tuple.getFirst());
        jsonResult.setTotal(tuple.getSecond());

        return toJson(jsonResult);
    }

    @RequestMapping("listmodel")
    public String listEleboxModel(EleboxConditionRequest request) {
        logger.info("[POST] /api/roadlighting/listmodel");

        Tuple.TwoTuple<List<EleboxModel>, Integer> tuple = eleboxServer.listEleboxModel(request);

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(tuple.getFirst());
        jsonResult.setTotal(tuple.getSecond());

        return toJson(jsonResult);
    }

    @RequestMapping("listmodelloop")
    public String listModelLoop(Long modelId) {
        logger.info("[POST] /api/roadlighting/listmodelloop");

        Tuple.TwoTuple<List<EleboxModelLoop>, Integer> tuple = eleboxServer.listModelLoop(modelId);

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(tuple.getFirst());
        jsonResult.setTotal(tuple.getSecond());

        return toJson(jsonResult);
    }

    @RequestMapping("addOrUpdateLighting")
    public String addOrUpdateLighting(@Valid LightRequest request, BindingResult bindingResult) {
        logger.info("[POST] /api/roadlighting/addOrUpdateLighting");

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

        int ret = lightServer.addOrUpdateLight(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }
    /*
    *前端接口-道路照明系统模块
    *十四点零一、通过UID统计灯具数量（判断灯具UID是否重复）
    * */
    @RequestMapping("countLightingByUId")
    public String countLightingByUId(String uid){
        logger.info("[POST] /api/roadlighting/countLightingByUId");
        int total = lightServer.getCountLightingByUId(uid);
        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setTotal(total);
        return toJson(jsonResult);
    }
    /*
     *前端接口-道路照明系统模块
     *十四点零二、通过灯杆号统计灯具数量（判断灯杆号是否重复）
     * */
    @RequestMapping("countLightingByLamppost")
    public String countLightingByLamppost(String lamppost){
        logger.info("[POST] /api/roadlighting/countLightingByLamppost");
        int total = lightServer.getCountLightingByLamppost(lamppost);
        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setTotal(total);
        return toJson(jsonResult);
    }
    /*
     *前端接口-道路照明系统模块
     *十四点零二、通过灯杆号统计灯具数量（判断灯杆号是否重复）
     * */
    @RequestMapping("countLightingByLampHead")
    public String countLightingByLampHead(String lamphead){
        logger.info("[POST] /api/roadlighting/countLightingByLampHead");
        int total = lightServer.getCountLightingByLampHead(lamphead);
        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setTotal(total);
        return toJson(jsonResult);
    }
    @RequestMapping("batchAddLighting")
    public String batchAddLight(LightRequest.BatchLightRequest request) {
        logger.info("[POST] /api/roadlighting/batchAddLighting");

        int ret = lightServer.batchAddLight(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("deleteLighting")
    public String deleteLighting(LightConditionRequest request) {
        logger.info("[POST] /api/roadlighting/deleteLighting");

        int ret = this.lightServer.deleteLight(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("listLighting")
    public String listLighting(LightConditionRequest request) {
        logger.info("[POST] /api/roadlighting/listLighting");

        Tuple.TwoTuple<List<LightingView>, Integer> tuple = this.lightServer.listLighting(request);

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(tuple.getFirst());
        jsonResult.setTotal(tuple.getSecond());

        return toJson(jsonResult);
    }

    @RequestMapping("getLighting")
    public String getLighting(Long id) {
        logger.info("[POST] /api/roadlighting/getLighting");

        LightingView lightingView = this.lightServer.getLightingView(id);

        List<LightingView> data = new ArrayList<>(1);
        data.add(lightingView);

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(data);

        return toJson(jsonResult);
    }

    @RequestMapping("updateLightBeElebox")
    public String updateLightBeElebox(LightConditionRequest request) {
        logger.info("[POST] /api/roadlighting/updateLightBeElebox");

        int ret = this.lightServer.updateLightBeElebox(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("addOrUpdateLightModel")
    public String addOrUpdateLightModel(@Valid LightModelRequest request, BindingResult bindingResult) {
        logger.info("[POST] /api/roadlighting/addOrUpdateLightModel");

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

        int ret = this.lightModelServer.addOrUpdateLightModel(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("deleteLightModel")
    public String deleteLightModel(LightModelConditionRequest request) {
        logger.info("[POST] /api/roadlighting/deleteLightModel");

        int ret = this.lightModelServer.deleteLightModel(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("listLightModel")
    public String listLightModel(LightModelConditionRequest request) {
        logger.info("[POST] /api/roadlighting/listLightModel");

        Tuple.TwoTuple<List<LightingModel>, Integer> tuple = this.lightModelServer.listLightModel(request);

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(tuple.getFirst());
        jsonResult.setTotal(tuple.getSecond());

        return toJson(jsonResult);
    }

    @RequestMapping("getLightTypeById")
    public String getLightTypeById(Long id) {
        logger.info("[POST] /api/roadlighting/getLightTypeById");

        LightingModel lightingModel = lightModelServer.getLightModelById(id);

        JsonResult jsonResult = JsonResult.getSUCCESS();
        List<LightingModel> lightingModels = new ArrayList<>(1);
        lightingModels.add(lightingModel);
        jsonResult.setData(lightingModels);

        return toJson(jsonResult);
    }

    @RequestMapping("addOrUpdateGIS")
    public String addOrUpdateGIS(GISRequest request) {
        logger.info("[POST] /api/roadlighting/addOrUpdateGIS");

        int ret = this.gisServer.addOrUpdateGIS(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("deleteGIS")
    public String deleteGIS(GISConditionRequest request) {
        logger.info("[POST] /api/roadlighting/deleteGIS");

        int ret = this.gisServer.deleteGIS(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("listGIS")
    public String listGIS(GISConditionRequest request) {
        logger.info("[POST] /api/roadlighting/listGIS");

        Tuple.TwoTuple<List<GISView>, Integer> tuple = this.gisServer.listGIS(request);

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(tuple.getFirst());
        jsonResult.setTotal(tuple.getSecond());

        return toJson(jsonResult);
    }

    @RequestMapping("addOrUpdateArea")
    public String addOrUpdateArea(@Valid AreaRequest request, BindingResult bindingResult) {
        logger.info("[POST] /api/roadlighting/addOrUpdateArea");

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

        int ret = this.areaServer.addOrUpdateArea(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("deleteArea")
    public String deleteArea(AreaConditionRequest request) {
        logger.info("[POST] /api/roadlighting/deleteArea");

        int ret = this.areaServer.deleteArea(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("listArea")
    public String listArea(AreaConditionRequest request) {
        logger.info("[POST] /api/roadlighting/listArea");

        Tuple.TwoTuple<List<Region>, Integer> tuple = this.areaServer.listArea(request);

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(tuple.getFirst());
        jsonResult.setTotal(tuple.getSecond());

        return toJson(jsonResult);
    }

    @RequestMapping("listLevel1Area")
    public String listLevel1Area() {
        logger.info("[POST] /api/roadlighting/listLevel1Area");

        List<Region> regionList = areaServer.listLevel1Area();

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(regionList);

        return toJson(jsonResult);
    }

    @RequestMapping("listSubArea")
    public String listSubArea(AreaConditionRequest request) {
        logger.info("[POST] /api/roadlighting/listSubArea");

        List<Region> regionList = areaServer.listSubArea(request.getId());

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(regionList);

        return toJson(jsonResult);
    }

    @RequestMapping("getLevelArea")
    public String getLevelArea() {
        logger.info("[POST] /api/roadlighting/getLevelArea");

        List<RegionView> regionViews = areaServer.getLevelRegion();

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(regionViews);

        return toJson(jsonResult);
    }

    @RequestMapping("getAreaById")
    public String getAreaById(Long id) {
        logger.info("[POST] /api/roadlighting/getAreaById");

        Region region = areaServer.getAreaById(id);

        List<Region> regionList = new ArrayList<>(1);
        regionList.add(region);

        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(regionList);

        return toJson(jsonResult);
    }

    @RequestMapping("getAreaDescById")
    public String getAreaDescById(Long id) {
        logger.info("[POST] /api/roadlighting/getAreaDescById");

        String areaDesc = areaServer.getLevelRegionDesc(id);

        JsonResult jsonResult = JsonResult.getSUCCESS();
        List<String> dataList = new ArrayList<>(1);
        dataList.add(areaDesc);
        jsonResult.setData(dataList);

        return toJson(jsonResult);
    }

    @RequestMapping("importElebox")
    public String importElebox(MultipartFile batchEleboxFile) {
        logger.info("[POST] /api/roadlighting/importElebox");

        int ret = -1;
        try {
            ret = eleboxServer.importElebox(batchEleboxFile.getInputStream(), batchEleboxFile.getOriginalFilename());
        } catch (IOException e) {
            logger.error(e.getMessage());
        }

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }
    @RequestMapping("exportElebox")
    public void exportElebox(EleboxConditionRequest request, HttpServletResponse response) {
        logger.info("[POST] /api/roadlighting/exportElebox");

        HSSFWorkbook workbook = eleboxServer.exportElebox(request.getEleboxIdList());

        // 设置excel的文件名称
        String excelName = "控制柜";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String downloadFileName = excelName + "-" + sdf.format(new Date());

        DownloadUtil.downloadExcel(response, downloadFileName, workbook);
    }

    @RequestMapping("importLighting")
    public String importLighting(MultipartFile batchImportLightingFile) {
        logger.info("[POST] /api/roadlighting/importLighting");

        int ret = -1;
        try {
            ret = lightServer.importLighting(batchImportLightingFile.getInputStream(), batchImportLightingFile.getOriginalFilename());
        } catch (IOException e) {
            logger.error(e.getMessage());
        }

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    @RequestMapping("exportLighting")
    public void exportLighting(LightConditionRequest request, HttpServletResponse response) {
        logger.info("[POST] /api/roadlighting/exportLighting");

        HSSFWorkbook workbook = lightServer.exportLighting(request.getLightIdList());

        // 设置excel的文件名称
        String excelName = "灯具";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String downloadFileName = excelName + "-" + sdf.format(new Date());

        DownloadUtil.downloadExcel(response, downloadFileName, workbook);
    }

    @RequestMapping("unbindLightBeElebox")
    public String unbindLightBeElebox(LightConditionRequest request) {
        logger.info("[POST] /api/roadlighting/unbindLightBeElebox");

        int ret = lightServer.unbindLightBeElebox(request.getLightIdList());

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }
    /*
      前端接口-道路照明系统模块
    * 三十、通过控制柜id获取该控制柜下全部回路信息
    * */
    @RequestMapping("listEleboxLoop")
    public String listEleboxLoop(Long id){
        logger.info("[POST] /api/roadlighting/listEleboxLoop");
        List<EleboxModelLoop> eleboxModelLoopList = modelLoopServer.listEleboxLoop(id);
        JsonResult jsonResult = JsonResult.getSUCCESS();
        jsonResult.setData(eleboxModelLoopList);
        return toJson(jsonResult);
    }

    /*
    *前端接口-道路照明系统模块
    *三十一、批量设置控制柜区域
    * */ 
    @RequestMapping("batchSetEleboxArea")
    public String batchSetEleboxArea(BatchSetEleboxAreaRequest batchSetEleboxAreaRequest){

        logger.info("[POST] /api/roadlighting/batchSetEleboxArea");

        int ret = eleboxServer.batchSetLightingArea(batchSetEleboxAreaRequest);
        JsonResult jsonResult = null;

        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    /*
    * 三十三、批量设置灯具所属区域
    * */
    @RequestMapping("batchSetLightArea")
    public String batchSetLightArea(BatchSetLightingAreaRequest batchSetLightingAreaRequest){

        logger.info("[POST] /api/roadlighting/batchSetLightArea");

        JsonResult jsonResult = null;
        int ret  = eleboxServer.batchSetLightingArea(batchSetLightingAreaRequest);
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }

    /*
     * 三十二、上传控制柜地图图标
     * */
    @RequestMapping("uploadEleboxGisIcon")
    public String uploadEleboxGisIcon(MultipartFile eleboxGisIcon ,HttpServletRequest request){

        logger.info("[POST] /api/roadlighting/uploadEleboxGisIcon");
        JsonResult jsonResult = JsonResult.getSUCCESS();
        if (eleboxGisIcon == null) {
            jsonResult.setMsg("文件不存在！");
            jsonResult = JsonResult.getFAILURE();
            return toJson(jsonResult);
        }
        String path=null;// 文件路径
        String type=null;// 文件类型
        String fileName=eleboxGisIcon.getOriginalFilename();// 文件原名称
        // 判断文件类型
        type=fileName.indexOf(".")!=-1?fileName.substring(fileName.lastIndexOf(".")+1, fileName.length()):null;
        if ("GIF".equals(type.toUpperCase())||"PNG".equals(type.toUpperCase())||"JPG".equals(type.toUpperCase())) {
            // 项目在容器中实际发布运行的根路径
            String realPath=request.getSession().getServletContext().getRealPath("/html/image/gisicon/");
            // 自定义的文件名称
            String trueFileName="\\elebox.png";
            // 设置存放图片文件的路径
            path=realPath+trueFileName;
            System.out.println("存放图片文件的路径:"+path);
            try{
                File tempFile = new File( realPath);
                // 判断父级目录是否存在，不存在则创建
                if (!tempFile.getParentFile().exists()) {
                    tempFile.getParentFile().mkdir();
                }
                // 判断文件是否存在，否则创建文件（夹）
                if (!tempFile.exists()) {
                    tempFile.mkdir();
                }
                // 转存文件到指定的路径
                eleboxGisIcon.transferTo(new File(path));
                System.out.println("文件成功上传到指定目录下");
            }catch (IOException o){
                o.printStackTrace();
            }
        }else {
            logger.info("不是我们想要的文件类型,请按要求重新上传");
        }
        return toJson(jsonResult);

    }

    /*
     * 三十四、上传灯具在GIS地图上显示的图标
     * */
    @RequestMapping("uploadLightGisIcon")
    public String uploadLightGisIcon(MultipartFile lightGisIcon ,HttpServletRequest request,HttpServletResponse response){

        logger.info("[POST] /api/roadlighting/uploadLightGisIcon");
        JsonResult jsonResult = JsonResult.getSUCCESS();
        if (lightGisIcon == null) {
            jsonResult.setMsg("文件不存在！");
            jsonResult = JsonResult.getFAILURE();
            return toJson(jsonResult);
        }
        String path=null;// 文件路径
        String type=null;// 文件类型
        String fileName=lightGisIcon  .getOriginalFilename();// 文件原名称
        // 判断文件类型
        type=fileName.indexOf(".")!=-1?fileName.substring(fileName.lastIndexOf(".")+1, fileName.length()):null;
        if ("GIF".equals(type.toUpperCase())||"PNG".equals(type.toUpperCase())||"JPG".equals(type.toUpperCase())) {
            // 项目在容器中实际发布运行的根路径
            String realPath=request.getSession().getServletContext().getRealPath("/html/image/gisicon/");
            // 自定义的文件名称
            String trueFileName="\\light.png";
            // 设置存放图片文件的路径
            path=realPath+trueFileName;
            System.out.println("存放图片文件的路径:"+path);
            try{
                File tempFile = new File( realPath);
                // 判断父级目录是否存在，不存在则创建
                if (!tempFile.getParentFile().exists()) {
                    tempFile.getParentFile().mkdir();
                }
                // 判断文件是否存在，否则创建文件（夹）
                if (!tempFile.exists()) {
                    tempFile.mkdir();
                }
                // 转存文件到指定的路径
                lightGisIcon.transferTo(new File(path));
                System.out.println("文件成功上传到指定目录下");
            }catch (IOException o){
                o.printStackTrace();
            }
        }else {
            logger.info("不是我们想要的文件类型,请按要求重新上传");
        }
        return toJson(jsonResult);

    }
    /*
     *三十五、批量设置灯具所属控制柜
     * */
    @RequestMapping("batchConfigLightsBeElebox")
    public String batchConfigLightsBeElebox(BatchConfigLightsBeEleboxRequest request){
        logger.info("[POST] /api/roadlighting/batchConfigLightsBeElebox");
        int ret =eleboxServer.batchConfigLightsBeElebox(request);
        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }
        return toJson(jsonResult);
    }

    @RequestMapping("updateLightPriority")
    public String updateLightPriority(LightConditionRequest request) {
        logger.info("[POST] /api/roadlighting/updateLightPriority");

        int ret = lightServer.updateLightPriority(request);

        JsonResult jsonResult = null;
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }

        return toJson(jsonResult);
    }
}
