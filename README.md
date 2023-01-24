# demo-spring-boot

@RestController
public class myController {
    
    @GetMapping("/check")
    public String myFunction(@RequestParam String msg){
        return "Messange in url is: "+msg;
    }

    @GetMapping("/check2")
    public String function2(){
        return "function 2 is calling without url parameters";
    }

}