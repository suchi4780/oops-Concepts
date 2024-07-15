interface MusicPlayer {
    void play();
    void stop();
}

class MP3Player implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing music from MP3 player...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on MP3 player...");
    }
}

class SpotifyPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing music from Spotify...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on Spotify...");

    }
}

public class Interface {
    public static void main(String[] args) {
        MusicPlayer mp3Player = new MP3Player();
        mp3Player.play();
        mp3Player.stop();

        MusicPlayer spotifyPlayer = new SpotifyPlayer();
        spotifyPlayer.play();
        spotifyPlayer.stop();
    }
}