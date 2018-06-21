package com.nnlightctl.server;

import com.nnlight.common.Tuple;
import com.nnlightctl.po.Scene;
import com.nnlightctl.request.*;
import com.nnlightctl.vo.SceneView;

import java.util.List;

public interface SceneServer {
    int addOrUpdateScene(SceneRequest request);

    Tuple.TwoTuple<List<Scene>, Integer> listScene(BaseRequest request);

    SceneView getScene(Long id);

    int deleteScene(SceneConditionRequest request);

    int addOrUpdateSceneShotcut(SceneShotcutRequest request);

    int deleteSceneShotcut(SceneShotcutConditionRequest request);

    int getInvokeSceneShotcut(String shotcutName);
}
