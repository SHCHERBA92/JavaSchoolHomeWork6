public class MessageMy extends Foto{
    private String text;
    private StringBuilder stringBuilder = new StringBuilder("");

    public MessageMy(String text) {
        this.text = text;
    }

    public MessageMy() {
    }

    public String creatMessage(String text)
    {
        stringBuilder.append(this.text).append(text);
        this.text = stringBuilder.toString();
        return this.text;
    }
    public void sendMess()
    {
        System.out.println("Отправить сообщение : " + this.text);
    }

    public void recieveMess()
    {
        System.out.println("Приняли сообщение");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void addToMessageFoto(String foto) {
        super.addToMessageFoto(foto);
        System.out.println("В сообщении");
    }

    @Override
    public void deleteToMessageFoto(String foto) {
        super.deleteToMessageFoto(foto);
        System.out.println("В сообщении");
    }
}
