from unittest.mock import patch
from mock1 import vissza
def test_vissza():
    with patch("mock1.linszoveg") as linszoveg_mock:
        linszoveg_mock.return_value="3x+4y"
        assert vissza(3,4)=="y4+x3"

test_vissza()
