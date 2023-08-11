
package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;


public interface ReporteService {
       
        public ResponseEntity<Resource>
                generaReporte(
                        String reporte,  // el nombre del archivo llamado .jasper
                        Map<String, Object> parametros,  //los parametros del reporte si tiene
                        String tipo  //tipo de reporte .... pdf.updf etc
                ) throws IOException;
}
