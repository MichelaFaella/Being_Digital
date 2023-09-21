package it.unisa.darn.application.control.metainfo;

import it.unisa.darn.application.service.autenticazione.util.PersonaAutenticata;
import it.unisa.darn.application.service.metainfo.CancellazioneRisorsaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/cancellazioneRisorsa")
public class CancellazioneRisorsaController {

  @Autowired
  private CancellazioneRisorsaService cancellazioneRisorsaService;

  @Autowired
  private PersonaAutenticata personaAutenticata;


}