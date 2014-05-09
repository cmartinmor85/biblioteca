package es.tri.dao;

import es.tri.dao.model.TriTUsuarios;

public interface TriTUsuariosMapper {
    int deleteByPrimaryKey(Integer id_usuario);

    int insert(TriTUsuarios record);

    int insertSelective(TriTUsuarios record);

    TriTUsuarios selectByPrimaryKey(Integer id_usuario);

    int updateByPrimaryKeySelective(TriTUsuarios record);

    int updateByPrimaryKey(TriTUsuarios record);
}