public class FilterOutPop implements GenreFilter {

    @Override
    public boolean permit(Album album) {
        if (album.genre() != "Pop") {
            return true;
        }
        return false;
    }

}
