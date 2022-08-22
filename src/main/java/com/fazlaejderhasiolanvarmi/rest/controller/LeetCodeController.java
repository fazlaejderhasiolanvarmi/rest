package com.fazlaejderhasiolanvarmi.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leetcode")
public class LeetCodeController {
    /*
    Leet Code - Two Sum Challenge
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.
     */
    public ResponseEntity<?> twoSum(int[] nums, int target){
        int[] solution = new int[2];

        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    solution[0] = i;
                    solution[1] = j;
                }

            }
        }

        return ResponseEntity.ok().body(solution);
    }

}
