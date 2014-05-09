package es.tri.dao;

import es.tri.dao.model.TriTaTipoUsuario;

public interface TriTaTipoUsuarioMapper {
    int deleteByPrimaryKey(Integer id_tipo_usuario);

    int insert(TriTaTipoUsuario record);

    int insertSelective(TriTaTipoUsuario record);

    TriTaTipoUsuario selectByPrimaryKey(Integer id_tipo_usuario);

    int updateByPrimaryKeySelective(TriTaTipoUsuario record);

    int updateByPrimaryKey(TriTaTipoUsuario record);
}