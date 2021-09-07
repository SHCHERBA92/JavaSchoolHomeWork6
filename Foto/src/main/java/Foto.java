public class Foto implements ActionFoto{
    @Override
    public void addFoto(String foto) {
        System.out.println("Добавим фото + " + foto);
    }

    @Override
    public void deleteFoto(String foto) {
        System.out.println("Удалили фото + " + foto);
    }

    @Override
    public void addToMessageFoto(String foto) {
        System.out.println("Добавим фото + " + foto);
    }

    @Override
    public void deleteToMessageFoto(String foto) {
        System.out.println("Удалили фото + " + foto);
    }

    @Override
    public void addToFriendsFoto(String foto) {
        System.out.println("Добавим фото + " + foto);
    }

    @Override
    public void deleteToFriendsFoto(String foto) {
        System.out.println("Удалили фото + " + foto);
    }
}
