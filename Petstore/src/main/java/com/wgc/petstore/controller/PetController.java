package com.wgc.petstore.controller;

import com.wgc.petstore.dao.PetMapper;
import com.wgc.petstore.dao.TagMapper;
import com.wgc.petstore.entity.Pet;
import com.wgc.petstore.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetMapper petMapper;

    /*通过查询宠物*/
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String selectAll(Model model) {
        List<Pet> pets = petMapper.selectAll();
        model.addAttribute("pet", pets);
        return "pet";
    }

    /*批量添加宠物*/
    @RequestMapping(value = "/batchAdd", method = RequestMethod.POST)
    public String batchAdd(@RequestBody List<Pet> pets) {
        int i = petMapper.batchAdd(pets);
        return "redirect:/pet/query";
    }
    /*修改宠物*/
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public String update(Pet pet) {
        int i = petMapper.updateByPrimaryKey(pet);
        return "redirect:/pet/query";
    }
    /*通过标签查询宠物*/
    @RequestMapping(value = "/tagQuery/{tag.name}", method = RequestMethod.GET)
    public String tagQuery(@PathVariable("tag.name") String name) {
        Pet pet = petMapper.selectTagName(name);
       // model.addAttribute("petTagName", pet);
        return "pet";
    }
    /*删除宠物*/
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String delPet(@PathVariable("id") int id) {
        int i = petMapper.deleteByPrimaryKey(id);
        return "redirect:/pet/query";
    }
}
