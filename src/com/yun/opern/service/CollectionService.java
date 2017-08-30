package com.yun.opern.service;

import com.yun.opern.model.BaseResponse;
import com.yun.opern.model.collection.*;

public interface CollectionService {

    BaseResponse isCollected(IsCollectedRequest request);

    BaseResponse addCollection(AddCollectionRequest request);

    BaseResponse removeCollection(RemoveCollectionRequest request);

    BaseResponse getCollection(GetCollectionRequest request);

    BaseResponse getCollectionOpern(GetCollectionOpernRequest request);

}
