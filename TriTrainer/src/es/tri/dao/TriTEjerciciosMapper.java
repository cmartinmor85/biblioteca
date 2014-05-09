package es.tri.dao;

import es.tri.dao.model.TriTEjercicios;

public interface TriTEjerciciosMapper {
    int deleteByPrimaryKey(Integer id_ejercicio);

    int insert(TriTEjercicios record);

    int insertSelective(TriTEjercicios record);

    TriTEjercicios selectByPrimaryKey(Integer id_ejercicio);

    int updateByPrimaryKeySelective(TriTEjercicios record);

    int updateByPrimaryKey(TriTEjercicios record);
}