package com.aaa.service;

import com.aaa.entity.Upplier;

import java.util.List;

public interface UpplierService {
    List<Upplier> findAllUpplier(Upplier upplier);
    int deleteUpplier(Integer upplierId);
    int addUpplier(Upplier upplier);
    int editUpplier(Upplier upplier);
}