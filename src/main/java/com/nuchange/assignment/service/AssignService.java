package com.nuchange.assignment.service;

import com.nuchange.assignment.model.AssignModel;

public interface AssignService {

    AssignModel storeUrl(String url);

    String getKey(String url);

    int getCount(String url);
}
