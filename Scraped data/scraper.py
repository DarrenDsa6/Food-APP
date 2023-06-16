import requests
from bs4 import BeautifulSoup

req = requests.get("https://www.dominos.co.in/menu/veg-pizzas")

soup = BeautifulSoup(req.content, "html.parser")

res = soup.img


print(res.get_text)