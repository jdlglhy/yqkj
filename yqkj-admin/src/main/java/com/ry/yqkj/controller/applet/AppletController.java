package com.ry.yqkj.controller.applet;

import com.ry.yqkj.common.core.controller.BaseController;
import com.ry.yqkj.common.core.domain.R;
import com.ry.yqkj.common.core.domain.entity.SysDept;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lihy
 * @Description : 测试
 * @date : 2024/5/18 12:11 上午
 */
@RestController
@RequestMapping("/applet")
@Api("测试控制器")
public class AppletController extends BaseController {


    @GetMapping("/test")
    @ApiOperation("测试-测试方法")
    public R<SysDept> test(SysDept dept){
        SysDept sysDept = new SysDept();
        sysDept.setDeptId(111L);
        sysDept.setDeptName("name");


        return R.ok(sysDept);
    }


}
