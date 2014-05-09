package es.tri.dao;

import es.tri.dao.model.TriTiEntrenoUsuario;

public interface TriTiEntrenoUsuarioMapper {
    int deleteByPrimaryKey(Integer id_entreno);

    int insert(TriTiEntrenoUsuario record);

    int insertSelective(TriTiEntrenoUsuario record);

    TriTiEntrenoUsuario selectByPrimaryKey(Integer id_entreno);

    int updateByPrimaryKeySelective(TriTiEntrenoUsuario record);

    int updateByPrimaryKey(TriTiEntrenoUsuario record);
}