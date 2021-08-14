package com.nuchange.assignment.service;

import com.nuchange.assignment.model.AssignModel;
import org.springframework.data.domain.Page;

public interface AssignService {

    AssignModel storeUrl(String url);

    String getKey(String url);

    int getCount(String url);

    Page<AssignModel> getList(int page, int size);
}
