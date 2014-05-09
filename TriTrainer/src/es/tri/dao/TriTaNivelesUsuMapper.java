package es.tri.dao;

import es.tri.dao.model.TriTaNivelesUsu;

public interface TriTaNivelesUsuMapper {
    int deleteByPrimaryKey(Integer id_nivel);

    int insert(TriTaNivelesUsu record);

    int insertSelective(TriTaNivelesUsu record);

    TriTaNivelesUsu selectByPrimaryKey(Integer id_nivel);

    int updateByPrimaryKeySelective(TriTaNivelesUsu record);

    int updateByPrimaryKey(TriTaNivelesUsu record);
}