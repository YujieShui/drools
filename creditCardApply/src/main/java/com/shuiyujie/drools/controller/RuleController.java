package com.shuiyujie.drools.controller;

import com.shuiyujie.drools.entity.CreditCardApplyInfo;
import com.shuiyujie.drools.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shui
 * @create 2020-07-20
 **/
@RestController
@RequestMapping("/rule")
public class RuleController {
    @Autowired
    private RuleService ruleService;
    @RequestMapping("/creditCardApply")
    public CreditCardApplyInfo creditCardApply(@RequestBody
                                                       CreditCardApplyInfo creditCardApplyInfo){
        creditCardApplyInfo = ruleService.creditCardApply(creditCardApplyInfo);
        return creditCardApplyInfo;
    }
}
