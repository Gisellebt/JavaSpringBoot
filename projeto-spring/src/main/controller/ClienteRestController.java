package one.digitalinnovation.gof.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;

@RequestMapping("Clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;
    @GetMapping
    public ResponseEntity<Iterable<Cliente> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(ClienteService.buscarTodos());

    }
    @GetMapping("/{id}")
    public ResponseEntity <Cliente> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.buscarPorId(id));

    }
    @PostMapping
    Public ResponseEntity <Cliente> inserir (@RequestBody Cliente){
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id,@RequestBody Cliente cliente){
        clienteService.atualizar(id,cliente);
        return ResponseEntity.ok(cliente);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<void> deletar(@PathVariable Long id){
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }



}
