package com.nnlightctl.springmvc.controller;


import com.nnlightctl.request.UploadDataRequest;
import com.nnlightctl.result.JsonResult;
import com.nnlightctl.server.UploadDataServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 上传GPS和EMEI编号
 *
 * @author keriezhang
 * @date 2019/4/11
 */
@RestController
@RequestMapping("api/uploadDataLighting")
public class UploadDataLightingController extends BaseController{
    private Logger logger=LoggerFactory.getLogger(UploadDataLightingController.class);
    @Autowired
    private UploadDataServer uploadDataServer;

    /**
     * 经度 维度 EMEI
     * @return
     */
    @RequestMapping("xyEMEI")
    public String xyEMEI(String x, String y, String imei){
        logger.info("[post] /api/uploadDataLighting/xyEMEI/");

        UploadDataRequest uploadDataRequest=new UploadDataRequest();
        uploadDataRequest.setLatitude(y);
        uploadDataRequest.setLongitude(x);
        uploadDataRequest.setImei(imei);

        JsonResult jsonResult = null;

        int ret = uploadDataServer.UploadGISAndImei(uploadDataRequest);
        if (ret > 0) {
            jsonResult = JsonResult.getSUCCESS();
        } else {
            jsonResult = JsonResult.getFAILURE();
        }
        return toJson(jsonResult);


    }


}
