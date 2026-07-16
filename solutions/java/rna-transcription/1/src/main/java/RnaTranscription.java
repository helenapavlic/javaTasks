class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < dnaStrand.length(); i++) {
            switch (dnaStrand.charAt(i)){
                case 'G':
                    output.append('C');
                    break;
                case 'C':
                    output.append('G');
                    break;
                case 'T':
                    output.append('A');
                    break;
                case 'A':
                    output.append('U');
                    break;
            }
        }
        return output.toString();
    }

}