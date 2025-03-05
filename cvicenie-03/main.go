package main

import (
	"fmt"

	"github.com/adiabat/btcd/chaincfg"
)

var (
	// we're running on BC3.  Which now uses mainnet addresses. However, be carefull what address arte you generating
	testnet3Parameters = &chaincfg.MainNetParams //TestNet3Params
)

// This is the main function -- c

func main() {
	fmt.Printf("BC3 utxohunt\n")

	// Task #1 make an address pair
	// Call AddressFrom PrivateKey() to make a keypair

	s, err := AddressFromPrivateKey()
	if err != nil {
		panic(err)
	}
	fmt.Printf("address: %s\n", s)

	// Task #2 make a transaction and call OpReturnTxBuilder(), you can look how EZTxBuilder() is building transactions
	// Check how EZTxBuilder is making a transaction
	//	tx := EZTxBuilder()
	//	var buf bytes.Buffer
	//	tx.Serialize(&buf)
	//	fmt.Printf("tx in hex:\n%x\n", buf.Bytes())
	//

	return
}
