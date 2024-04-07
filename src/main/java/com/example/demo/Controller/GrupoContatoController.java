package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.GrupoContato;
import com.example.demo.Repositories.GrupoContatoRepository;

@RestController
@RequestMapping("/grupos-contatos")
public class GrupoContatoController {

    @Autowired
    private GrupoContatoRepository grupoContatoRepository;

    @GetMapping("/{id}")
    public ResponseEntity<GrupoContato> obterGrupoContatoPorId(@PathVariable Long id) {
        GrupoContato grupoContato = grupoContatoRepository.findById(id).orElse(null);
        if (grupoContato != null) {
            return ResponseEntity.ok(grupoContato);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<GrupoContato> criarGrupoContato(@RequestBody GrupoContato grupoContato) {
        GrupoContato novoGrupoContato = grupoContatoRepository.save(grupoContato);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoGrupoContato);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GrupoContato> atualizarGrupoContato(@PathVariable Long id, @RequestBody GrupoContato grupoContato) {
        if (!grupoContatoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        grupoContato.setId(id);
        GrupoContato grupoContatoAtualizado = grupoContatoRepository.save(grupoContato);
        return ResponseEntity.ok(grupoContatoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarGrupoContato(@PathVariable Long id) {
        if (!grupoContatoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        grupoContatoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
