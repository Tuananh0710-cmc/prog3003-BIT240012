/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.designpatterndemo;

/**
 *
 * @author panhh
 */
public class MediaAdapter implements MediaPlayer {
    // Khai báo đối tượng VLC bên trong Adapter
    private VlcPlayer vlcPlayer;

    public MediaAdapter() {
        vlcPlayer = new VlcPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        // Nếu là vlc, Adapter sẽ gọi lệnh playVlc của thư viện mới
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else {
            System.out.println("Định dạng " + audioType + " không được hỗ trợ bởi Adapter.");
        }
    }
}
