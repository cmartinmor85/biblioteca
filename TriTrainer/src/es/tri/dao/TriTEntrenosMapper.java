package es.tri.dao;

import es.tri.dao.model.TriTEntrenos;

public interface TriTEntrenosMapper {
    int deleteByPrimaryKey(Integer id_entreno_ejercicio);

    int insert(TriTEntrenos record);

    int insertSelective(TriTEntrenos record);

    TriTEntrenos selectByPrimaryKey(Integer id_entreno_ejercicio);

    int updateByPrimaryKeySelective(TriTEntrenos record);

    int updateByPrimaryKey(TriTEntrenos record);
}