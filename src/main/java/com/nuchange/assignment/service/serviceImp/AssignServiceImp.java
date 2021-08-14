package com.nuchange.assignment.service.serviceImp;

import com.nuchange.assignment.dao.AssignDao;
import com.nuchange.assignment.model.AssignModel;
import com.nuchange.assignment.service.AssignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AssignServiceImp implements AssignService {

    AssignDao assignDao;

    @Autowired
    public AssignServiceImp(AssignDao assignDao) {
        this.assignDao = assignDao;
    }

    @Override
    public AssignModel storeUrl(String url) {
        AssignModel assignModel = new AssignModel();
        assignModel.setUrl(url);
        assignDao.save(assignModel);
        return assignModel;
    }

    @Override
    public String getKey(String url) {
        AssignModel assignModel = assignDao.findByUrl(url);
        assignModel.setCount(assignModel.getCount() + 1);
        assignDao.save(assignModel);
        return assignModel.getUuid();
    }

    @Override
    public int getCount(String url) {
        AssignModel assignModel = assignDao.findByUrl(url);
        return assignModel.getCount();
    }

    @Override
    public Page<AssignModel> getList(int page, int size) {
        Pageable pageable=PageRequest.of(page, size);
        return assignDao.findAll(pageable);
    }
}
