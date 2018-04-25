package com.example.demo.demoapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
  @Test
  public void add_isCorrect() throws Exception {
    assertEquals(4, 2 + 2);
  }


  @Test
  public void username_Correct_ReturnsTrue()throws Exception{
    assertTrue(LoginActivity.isValidUserName("user1"));
  }
  @Test
  public void password_Wrong_ReturnsFalse() throws Exception {
    assertFalse(LoginActivity.username.getText().toString().equals("user2"));
  }


}
