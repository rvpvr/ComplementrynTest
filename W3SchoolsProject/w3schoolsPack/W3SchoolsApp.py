from selenium import webdriver
from selenium.webdriver.common.by import By
import pytest

driver = webdriver.Chrome()


@pytest.fixture
def var_url():
    url = "https://www.w3schools.com/"
    return url


def test_launch_app(var_url):
    driver.maximize_window()
    driver.get(var_url)
    driver.implicitly_wait(10)


def test_verify_page_title():
    logo_element = driver.find_element(By.XPATH, "(//div//child::i[contains(@class,'logo')])[1]")
    is_logo_displayed = logo_element.is_displayed()
    assert is_logo_displayed == True
    print("Is logo displayed?:", is_logo_displayed)


def test_close_browser():
    driver.quit()
