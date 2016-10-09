package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pradeep on 9/10/16.
 */
public class TicTacToe {

    private List<List<String>> board = new ArrayList<List<String>>();

    @Given("^a board like this :$")
    public void a_board_like_this(DataTable dataTable) throws Throwable {
        for (List<String> row : dataTable.raw()) {
            List<String> column = new ArrayList<String>();
            for (String col : row) {
                column.add(col);
            }
            this.board.add(column);
        }
        System.out.print("Board : ");
        System.out.println(board);
    }

    @When("^player x plays in row (\\d+), column (\\d+)$")
    public void player_x_plays_in_row_column(int row, int col) throws Throwable {
        System.out.println("Player X plays at : " + row + " - " + col);
        this.board.get(row).set(col, "X");
    }

    @Then("^the board should look like this :$")
    public void the_board_should_look_like_this(DataTable modifiedTable) throws Throwable {
        modifiedTable.diff(this.board);
    }

}
