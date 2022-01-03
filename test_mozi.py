from unittest.mock import patch
from mozi_fizetes import fizetes

def test_fizetes():
    with patch("mozi_fizetes.mozi.kedvezmeny") as kedvezmeny_mock:
        kedvezmeny_mock.return_value=20
        assert fizetes("Budapest",68,2000)==1600
test_fizetes()
