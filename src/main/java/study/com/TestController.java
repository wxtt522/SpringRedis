package study.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.cn.RedisUtils;
import study.entity.Person;
import study.mapper.PersonMapper;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    PersonMapper personMapper;

    @Autowired
    RedisUtils redisUtils;

    @RequestMapping("/getPersons")
    public List<Person> getPersons(){
        return personMapper.selectAll();
    }

    @RequestMapping("/getKey")
    public String getKey(String key){
        return redisUtils.get(key).toString();
    }

    @RequestMapping("/setValue")
    public void setValue(String key, String value) {
        redisUtils.set(key,value);
    }
}
