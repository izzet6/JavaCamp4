public class GameManager implements IGameManager{

    @Override
    public void add(Game game) {
        System.out.println("Oyun eklendi");
    }

    @Override
    public void delete(Game game) {
        System.out.println("Oyun silindi");
    }

    @Override
    public void update(Game game) {
        System.out.println("Oyun guncellendi");
    }
}
