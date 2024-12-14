package com.example.EA2_Velezmoro_Navarro_James.controller;


import com.example.EA2_Velezmoro_Navarro_James.model.Reserva;
import com.example.EA2_Velezmoro_Navarro_James.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping
    public String listarReservas(Model model) {
        model.addAttribute("reservas", reservaService.listarReservas());
        return "listaReservas";
    }

    @GetMapping("/nueva")
    public String mostrarFormularioReserva(Model model) {
        model.addAttribute("reserva", new Reserva());
        return "formularioReserva";
    }

    @PostMapping
    public String guardarReserva(@ModelAttribute Reserva reserva) {
        reservaService.guardarReserva(reserva);
        return "redirect:/reservas";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicion(@PathVariable Long id, Model model) {
        model.addAttribute("reserva", reservaService.obtenerReservaPorId(id));
        return "formularioReserva";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarReserva(@PathVariable Long id) {
        reservaService.eliminarReserva(id);
        return "redirect:/reservas";
    }
}
