package br.com.unifalmg.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Test
    void contextLoads() {
    }

    
    @Test
    public void testGetAllUsers() {
        // Criar uma lista de usuários fictícia para simular a resposta do repositório
        List<User> userList = Arrays.asList(
                new User(1, "John Doe", "john.doe", "john@example.com"),
                new User(2, "Jane Doe", "jane.doe", "jane@example.com")
        );

        // Configurar o comportamento do repositório mock
        when(userRepository.findAll()).thenReturn(userList);

        // Chamar o método que queremos testar
        List<User> result = userService.getAllUsers();

        // Verificar se o método do repositório foi chamado
        verify(userRepository, times(1)).findAll();

        // Verificar se a lista retornada pelo serviço é a mesma que configuramos no mock
        assertEquals(userList, result);
    }

}
