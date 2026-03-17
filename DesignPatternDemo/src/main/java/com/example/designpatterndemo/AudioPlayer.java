/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.designpatterndemo;

/**
 *
 * @author panhh
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // 1. Hỗ trợ mặc định cho file mp3
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Dang phat file MP3: " + fileName);
        } 
        // 2. Sử dụng Adapter để hỗ trợ file vlc
        else if (audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, fileName);
        } 
        else {
            System.out.println("Loi: Dinh dang " + audioType + " khong ho tro!");
        }
    }

    public static void main(String[] args) {
        AudioPlayer myPlayer = new AudioPlayer();

        myPlayer.play("mp3", "Rolling_in_the_deep.mp3");
        myPlayer.play("vlc", "Hoi_nghi_khach_hang.vlc");
        myPlayer.play("avi", "Phim_hanh_dong.avi"); // Định dạng không hỗ trợ
    }
}
