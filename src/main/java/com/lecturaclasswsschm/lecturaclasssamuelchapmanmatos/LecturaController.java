package com.lecturaclasswsschm.lecturaclasssamuelchapmanmatos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**@author Dell Samuel Chapman Matos*/

@RestController
public class LecturaController {
			
    public final LecturaArchivoSCHMService LECTURAARCHIVOSCHMSERVICE = new LecturaArchivoSCHMService();
    public final SaveFileService SAVEFILESERVICE = new SaveFileService();
		
	@GetMapping("/")
	public List<String> getStartReadFile() {
            return List.of("Please","Insert Route and File Name");
	}
        
        @GetMapping("save")
        public DataFile SaveFile(){
            String response = "";
            DataFile datafile = new DataFile();
        try {
            datafile = SAVEFILESERVICE.saveFileTxt();
        } catch (IOException ex) {
            Logger.getLogger(LecturaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datafile;
	}
        
        @PostMapping("/savearchivos")
        public List<String> SaveFilePost(@RequestBody DataFile datafile){
            String response = "";
        try {
            response =  SAVEFILESERVICE.saveFileTxtPost(datafile);
        } catch (IOException ex) {
            Logger.getLogger(LecturaController.class.getName()).log(Level.SEVERE, null, ex);
            return List.of("Response","Error: "+ex);
        }
        return List.of("Response",response);
	}
                
        @PostMapping("lecturaclass")
        public ArrayList<ItemsClass> getReadClassFile(@RequestBody ReadRouteNameFile readroutenamefile) {
            return LECTURAARCHIVOSCHMSERVICE.getListObjClass(readroutenamefile);
	}
}
