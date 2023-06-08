package ducvu.demo.models;

public class SearchDTO {
    String searchTerm;

    public SearchDTO() {
        super();
    }
    public SearchDTO(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }
}
