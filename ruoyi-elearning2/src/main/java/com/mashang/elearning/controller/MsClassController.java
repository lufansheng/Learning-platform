package com.mashang.elearning.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mashang.elearning.core.Result;
import com.mashang.elearning.core.TableDate;
import com.mashang.elearning.domain.MsClass;
import com.mashang.elearning.domain.Vo.MsClassAllVo;
import com.mashang.elearning.domain.Vo.MsClassPageVo;

import com.mashang.elearning.domain.parms.MsClass.MsClassCreate;
import com.mashang.elearning.domain.parms.MsClass.MsClassDtlVo;
import com.mashang.elearning.domain.parms.MsClass.MsClassUpdate;
import com.mashang.elearning.mapping.MsClassMapping;
import com.mashang.elearning.service.IMsClassService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.Pager;
import com.ruoyi.common.utils.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "班级模板")
@RestController
@RequestMapping("/class")
public class MsClassController extends BaseController {

    @Autowired
    private IMsClassService msClassService;

    @ApiOperation("分页查询")
    @GetMapping("/list")
    public TableDate<MsClassPageVo> page(String className, Pager pager){

        LambdaQueryWrapper<MsClass> qw = new LambdaQueryWrapper<>();

        qw.like(StringUtils.isNotEmpty(className),MsClass::getClassName,className);
        qw.ne(MsClass::getDelFlag,"2");

        Page<MsClass> page = msClassService.page(new Page<>(pager.getPageNum(),pager.getPageSize()),qw);

        List<MsClassPageVo> vos = MsClassMapping.INSTANCE.to(page.getRecords());
        return TableDate.success(vos,page.getTotal());
    }

    @ApiOperation("添加接口")
    @PostMapping
    public Result create(@RequestBody @Validated MsClassCreate create){
        MsClass msClass = MsClassMapping.INSTANCE.to(create);
        return Result.to(msClassService.save(msClass));
    }

    @ApiOperation("查询详情接口")
    @GetMapping("/{id}")
    public Result<MsClassDtlVo> getById(@PathVariable Long id){
        MsClassDtlVo msClass = MsClassMapping.INSTANCE.to(msClassService.getById(id));
        return Result.success(msClass);
    }

    @ApiOperation("修改接口")
    @PutMapping
    public Result update(@RequestBody @Validated MsClassUpdate update){
        MsClass msClass = MsClassMapping.INSTANCE.to(update);
        return Result.to(msClassService.updateById(msClass));
    }

    @ApiOperation("删除接口")
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id){
        MsClass msClass = new MsClass();
        msClass.setClassId(id);
        msClass.setDelFlag("2");
        return Result.to(msClassService.updateById(msClass));
    }

    //班级下拉框
    @ApiOperation("查询所有班级")
    @GetMapping("/all")
    public Result<List<MsClassAllVo>> test(String className){
        LambdaQueryWrapper<MsClass> qw = new LambdaQueryWrapper<>();
        qw.like(StringUtils.isNotEmpty(className),MsClass::getClassName,className);
        qw.ne(MsClass::getDelFlag,"2");

        List<MsClassAllVo> vos = MsClassMapping.INSTANCE.toAllVo(msClassService.list(qw));

        return Result.success(vos);
    }

}
