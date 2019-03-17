package com.act.website;

import com.act.modules.sys.entity.SysMenu;
import com.github.pagehelper.Page;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCase {
    private MockMvc mvc;

    @Autowired
    private WebApplicationContext context;
    @Before
    public void setUP()throws Exception{
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void odbcTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/hello/getUser?id=1dff39c6b5974600becf7b282099f896")
                .accept(MediaType.APPLICATION_JSON_UTF8)).andDo(print());
    }

    @Test
    public void testcase(){
        List<String> testList = new ArrayList<>();
        if(testList instanceof Page){
            System.out.println("??");
        }

    }
}
