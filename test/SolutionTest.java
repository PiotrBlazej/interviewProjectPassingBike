import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by Piotr on 2017-11-17.
 */
public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @org.junit.Test
    public void shouldReturn5Pairs() throws Exception {
        //given
        int array[] = {0, 1, 0, 1, 1};
        //when
        int solution = this.solution.solution(array);
        //then
        assertEquals(5, solution);
    }

    @org.junit.Test
    public void shouldReturn0WhenBoundaryConditions() throws Exception {
        //given
        //P - east 0, Q west 1;
        int array[] = {1};
        //when
        int solution = this.solution.solution(array);
        //then
        assertEquals(0, solution);
    }

    @org.junit.Test
    public void shouldReturn0WhenTheyAreNotPassing() {
        //given
        int array[] = {1, 0};
        //when
        int solution = this.solution.solution(array);
        //then
        assertEquals(0, solution);

    }
    @org.junit.Test
    public void shouldReturn0WhenNoBikeGoEast() {
        //given
        int array[] = {1, 1, 1};
        //when
        int solution = this.solution.solution(array);
        //then
        assertEquals(0, solution);
    }

    @org.junit.Test
    public void shouldReturn1WhenOneBikeGoWestAndOneEst() {
        //given
        int array[] = {0,1};
        //when
        int solution = this.solution.solution(array);
        //then
        assertEquals(1, solution);
    }

}