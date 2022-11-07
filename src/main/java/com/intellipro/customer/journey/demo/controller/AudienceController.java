package com.intellipro.customer.journey.demo.controller;

import com.intellipro.customer.journey.demo.entity.Audience;
import com.intellipro.customer.journey.demo.entity.Tag;
import com.intellipro.customer.journey.demo.entity.User;
import com.intellipro.customer.journey.demo.error.AudienceNotFoundException;
import com.intellipro.customer.journey.demo.error.TagNotFoundException;
import com.intellipro.customer.journey.demo.error.UserNotFoundException;
import com.intellipro.customer.journey.demo.service.AudienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AudienceController {

    @Autowired
    private AudienceService audienceService;

    // Task 1, input is user_id, change return to Audience object
    @GetMapping("/audience/{id}")
    public List<Audience> getAudienceAndTagByUser(@PathVariable("id") Long userId) throws UserNotFoundException {
        return audienceService.getAudienceAndTagByUser(userId);
    }


//    // Task 6, input is audience_id, tag_id, no output
//    @PostMapping("/audiences/{audience}/{tag}")
//    public Audience createRelationBetweenAudienceAndTag(@PathVariable("audience") Long audienceId, @PathVariable("tag") Long tagId) throws AudienceNotFoundException, TagNotFoundException {
//        return audienceService.createRelationBetweenAudienceAndTag(audienceId, tagId);
//    }


}