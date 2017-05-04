package com.activity.dao;

import com.activity.model.ActEvtLog;

public interface ActEvtLogMapper {
    int deleteByPrimaryKey(Long logNr);

    int insert(ActEvtLog record);

    int insertSelective(ActEvtLog record);

    ActEvtLog selectByPrimaryKey(Long logNr);

    int updateByPrimaryKeySelective(ActEvtLog record);

    int updateByPrimaryKeyWithBLOBs(ActEvtLog record);

    int updateByPrimaryKey(ActEvtLog record);
}