from atm_card import ATMCard

class Customer:
    def __init__(self,idCust,pin = 1234,saldo = 10000):
        self.idCust = idCust
        self.pin = pin
        self.saldo = saldo

        def cekID(self):
            return self.idCust
        def cekPin(self):
            return self.pin
        def cekSaldo(self):
            return self.saldo

    def debet(self,nominal):
        self.nominal -= nominal
    def simpan(self,nominal):
        self.nominal += nominal