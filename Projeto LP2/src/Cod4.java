/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
class Cod4 {
    public class App {
    public static void main(String[] args) {
        Posto posto = new Posto(3);
        Caminhao caminhao = new Caminhao("Mercedes", "1318", 16);

        try {
            Bomba bombaDisponivel = posto.bombaDisponivel();
            bombaDisponivel.abastecer(caminhao);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}

}
