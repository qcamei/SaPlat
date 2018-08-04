package io.jboot.admin.service.api;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import io.jboot.admin.service.entity.model.FileProject;

import java.util.List;

public interface FileProjectService  {

    /**
     * find model by primary key
     *
     * @param id
     * @return
     */
    public FileProject findById(Object id);


    /**
     * find all model
     *
     * @return all <FileProject
     */
    public List<FileProject> findAll();


    /**
     * find All By ProjectID
     *
     * @param id
     * @return
     */
    public List<FileProject> findAllByProjectID(Long id);

    /**
     * find model By projectID And fileTypeID
     *
     * @param projectID
     * @param projectFileID
     * @return
     */
    public FileProject findByProjectIDAndProjectFileID(Long projectID, Long projectFileID);

    /**
     * delete model by primary key
     *
     * @param id
     * @return success
     */
    public boolean deleteById(Object id);


    /**
     * delete model
     *
     * @param model
     * @return
     */
    public boolean delete(FileProject model);


    /**
     * 删除fileProject 禁用files
     * @param model
     * @return
     */
    public boolean deleteFileProjectAndFiles(FileProject model);

    /**
     * 保存fileProject 启用files
     * @param model
     * @return
     */

    public boolean saveFileProjectAndFiles(FileProject model);
    /**
     * save model to database
     *
     * @param model
     * @return
     */
    public boolean save(FileProject model);


    /**
     * save or update model
     *
     * @param model
     * @return if save or update success
     */
    public boolean saveOrUpdate(FileProject model);


    /**
     * update data model
     *
     * @param model
     * @return
     */
    public boolean update(FileProject model);

    public Page<FileProject> findPage(FileProject fileProject, int pageNumber, int pageSize);


    public void join(Page<? extends Model> page, String joinOnField);
    public void join(Page<? extends Model> page, String joinOnField, String[] attrs);
    public void join(Page<? extends Model> page, String joinOnField, String joinName);
    public void join(Page<? extends Model> page, String joinOnField, String joinName, String[] attrs);
    public void join(List<? extends Model> models, String joinOnField);
    public void join(List<? extends Model> models, String joinOnField, String[] attrs);
    public void join(List<? extends Model> models, String joinOnField, String joinName);
    public void join(List<? extends Model> models, String joinOnField, String joinName, String[] attrs);
    public void join(Model model, String joinOnField);
    public void join(Model model, String joinOnField, String[] attrs);
    public void join(Model model, String joinOnField, String joinName);
    public void join(Model model, String joinOnField, String joinName, String[] attrs);

    public void keep(Model model, String... attrs);
    public void keep(List<? extends Model> models, String... attrs);
}