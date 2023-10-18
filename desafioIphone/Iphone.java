package desafioIphone;

import desafioIphone.services.MusicPlayerService;
import desafioIphone.services.PhoneService;
import desafioIphone.services.BrowserService;

public class Iphone implements MusicPlayerService, PhoneService, BrowserService {
    @Override
    public void playMusic() {
        System.out.println("Reprodutor de Música: Tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Reprodutor de Música: Pausando música");
    }

    @Override
    public void selectMusic() {
        System.out.println("Reprodutor de Música: Selecionando música");
    }

    @Override
    public void call() {
        System.out.println("Aparelho Telefônico: Fazendo uma ligação");
    }

    @Override
    public void answerCall() {
        System.out.println("Aparelho Telefônico: Atendendo uma chamada");
    }

    @Override
    public void voiceChat() {
        System.out.println("Aparelho Telefônico: Iniciando chat de voz");
    }

    @Override
    public void displayPage() {
        System.out.println("Navegador na Internet: Exibindo página da web");
    }

    @Override
    public void addTab() {
        System.out.println("Navegador na Internet: Adicionando nova aba");
    }

    @Override
    public void refreshPage() {
        System.out.println("Navegador na Internet: Atualizando página");
    }
}
